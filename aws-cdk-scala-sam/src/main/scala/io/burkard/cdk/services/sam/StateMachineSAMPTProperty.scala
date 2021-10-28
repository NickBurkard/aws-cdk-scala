package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object StateMachineSAMPTProperty {

  def apply(
    stateMachineName: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.StateMachineSAMPTProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.StateMachineSAMPTProperty.Builder)
      .stateMachineName(stateMachineName.orNull)
      .build()
}
