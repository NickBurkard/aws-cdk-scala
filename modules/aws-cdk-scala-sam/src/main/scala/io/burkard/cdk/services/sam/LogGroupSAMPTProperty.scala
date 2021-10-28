package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LogGroupSAMPTProperty {

  def apply(
    logGroupName: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.LogGroupSAMPTProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.LogGroupSAMPTProperty.Builder)
      .logGroupName(logGroupName.orNull)
      .build()
}
