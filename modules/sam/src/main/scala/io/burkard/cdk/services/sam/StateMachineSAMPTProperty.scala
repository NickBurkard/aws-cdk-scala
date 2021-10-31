package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StateMachineSAMPTProperty {

  def apply(
    stateMachineName: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnStateMachine.StateMachineSAMPTProperty =
    (new software.amazon.awscdk.services.sam.CfnStateMachine.StateMachineSAMPTProperty.Builder)
      .stateMachineName(stateMachineName.orNull)
      .build()
}
