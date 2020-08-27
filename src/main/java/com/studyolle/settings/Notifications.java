package com.studyolle.settings;

import com.studyolle.domain.Account;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Notifications {

    private boolean studyCreateByEmail;

    private boolean studyCreateByWeb;

    private boolean studyEnrollmentResultByEmail;

    private boolean studyEnrollmentResultByWeb;

    private boolean studyUpdateByEmail;

    private boolean studyUpdateByWeb;

    public Notifications(Account account) {

        this.studyCreateByEmail = account.isStudyCreatedEmail();
        this.studyCreateByWeb = account.isStudyCreateWeb();
        this.studyEnrollmentResultByEmail = account.isStudyEnrollmentResultByEmail();
        this.studyEnrollmentResultByWeb = account.isStudyEnrollmentResultByWeb();
        this.studyUpdateByEmail = account.isStudyUpdateByEmail();
        this.studyUpdateByWeb = account.isStudyUpdateByWeb();
    }
}
