

export class Inscription {
    userSurname: string;
    userFirstname: string;
    userAddress: string;
    userPhone: string;
    userDateBirth: Date;
    userEmail: string;
    userPassword: string;

    constructor(userSurname: string, userFirstname: string, userAddress: string, userPhone: string, userDateBirth: Date, userEmail: string, userPassword: string) {
        this.userSurname = userSurname;
        this.userFirstname = userFirstname;
        this.userAddress = userAddress;
        this.userPhone = userPhone;
        this.userDateBirth = userDateBirth;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
    }
}
