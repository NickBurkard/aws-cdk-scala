package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnPlacementGroup {

  def apply(
    internalResourceId: String,
    strategy: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnPlacementGroup =
    software.amazon.awscdk.services.ec2.CfnPlacementGroup.Builder
      .create(stackCtx, internalResourceId)
      .strategy(strategy.orNull)
      .build()
}
