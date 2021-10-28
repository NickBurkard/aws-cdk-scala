package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RecoveryOptionProperty {

  def apply(
    name: Option[String] = None,
    priority: Option[Number] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPool.RecoveryOptionProperty =
    (new software.amazon.awscdk.services.cognito.CfnUserPool.RecoveryOptionProperty.Builder)
      .name(name.orNull)
      .priority(priority.orNull)
      .build()
}
