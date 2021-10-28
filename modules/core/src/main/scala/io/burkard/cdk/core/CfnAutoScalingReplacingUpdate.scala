package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnAutoScalingReplacingUpdate {

  def apply(
    willReplace: Option[Boolean] = None
  ): software.amazon.awscdk.CfnAutoScalingReplacingUpdate =
    (new software.amazon.awscdk.CfnAutoScalingReplacingUpdate.Builder)
      .willReplace(willReplace.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
