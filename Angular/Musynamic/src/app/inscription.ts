export class Inscription {

    userSurname: string;
    userFirstname: string;
    userAddress: string;
    userPhone: string;
    userDateBirth: Date;
    userEmail: string;
    userPassword: string;
    userRights: string;

    constructor(userSurname: string, userFirstname: string, userAddress: string, userPhone: string, userDateBirth: Date, userEmail: string, userPassword: string, userRights: string) {
        this.userSurname = userSurname;
        this.userFirstname = userFirstname;
        this.userAddress = userAddress;
        this.userPhone = userPhone;
        this.userDateBirth = userDateBirth;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userRights = userRights;
    }
}
