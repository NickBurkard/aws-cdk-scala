package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LambdaConfigurationProperty {

  def apply(
    event: Option[String] = None,
    filter: Option[software.amazon.awscdk.services.s3.CfnBucket.NotificationFilterProperty] = None,
    function: Option[String] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.LambdaConfigurationProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.LambdaConfigurationProperty.Builder)
      .event(event.orNull)
      .filter(filter.orNull)
      .function(function.orNull)
      .build()
}
