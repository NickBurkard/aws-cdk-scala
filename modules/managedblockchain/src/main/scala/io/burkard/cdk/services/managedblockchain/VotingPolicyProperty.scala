package io.burkard.cdk.services.managedblockchain

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VotingPolicyProperty {

  def apply(
    approvalThresholdPolicy: Option[software.amazon.awscdk.services.managedblockchain.CfnMember.ApprovalThresholdPolicyProperty] = None
  ): software.amazon.awscdk.services.managedblockchain.CfnMember.VotingPolicyProperty =
    (new software.amazon.awscdk.services.managedblockchain.CfnMember.VotingPolicyProperty.Builder)
      .approvalThresholdPolicy(approvalThresholdPolicy.orNull)
      .build()
}
