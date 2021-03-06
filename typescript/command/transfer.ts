import { TransferParam } from "./transfer_param";

export class Transfer {
    constructor(private readonly command: (transferParam: TransferParam) => void) {}

    start(transferParam: TransferParam) {
        this.command(transferParam);
    }
}