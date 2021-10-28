package io.burkard.cdk.services.elasticbeanstalk

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnApplication {

  def apply(
    internalResourceId: String,
    description: Option[String] = None,
    applicationName: Option[String] = None,
    resourceLifecycleConfig: Option[software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationResourceLifecycleConfigProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.elasticbeanstalk.CfnApplication =
    software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.Builder
      .create(stackCtx, internalResourceId)
      .description(description.orNull)
      .applicationName(applicationName.orNull)
      .resourceLifecycleConfig(resourceLifecycleConfig.orNull)
      .build()
}
