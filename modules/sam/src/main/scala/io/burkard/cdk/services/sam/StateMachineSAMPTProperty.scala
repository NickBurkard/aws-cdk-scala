package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StateMachineSAMPTProperty {

  def apply(
    stateMachineName: String
  ): software.amazon.awscdk.services.sam.CfnStateMachine.StateMachineSAMPTProperty =
    (new software.amazon.awscdk.services.sam.CfnStateMachine.StateMachineSAMPTProperty.Builder)
      .stateMachineName(stateMachineName)
      .build()
}
