package com.studyolle.settings.Form;

import lombok.Data;

@Data
public class Notifications {

    private boolean studyCreateByEmail;

    private boolean studyCreateByWeb;

    private boolean studyEnrollmentResultByEmail;

    private boolean studyEnrollmentResultByWeb;

    private boolean studyUpdateByEmail;

    private boolean studyUpdateByWeb;

}
