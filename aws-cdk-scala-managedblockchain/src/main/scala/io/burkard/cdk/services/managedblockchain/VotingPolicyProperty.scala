package io.burkard.cdk.services.managedblockchain

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VotingPolicyProperty {

  def apply(
    approvalThresholdPolicy: Option[software.amazon.awscdk.services.managedblockchain.CfnMember.ApprovalThresholdPolicyProperty] = None
  ): software.amazon.awscdk.services.managedblockchain.CfnMember.VotingPolicyProperty =
    (new software.amazon.awscdk.services.managedblockchain.CfnMember.VotingPolicyProperty.Builder)
      .approvalThresholdPolicy(approvalThresholdPolicy.orNull)
      .build()
}
