package io.burkard.cdk.services.elasticbeanstalk

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ApplicationResourceLifecycleConfigProperty {

  def apply(
    serviceRole: Option[String] = None,
    versionLifecycleConfig: Option[software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationVersionLifecycleConfigProperty] = None
  ): software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationResourceLifecycleConfigProperty =
    (new software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.ApplicationResourceLifecycleConfigProperty.Builder)
      .serviceRole(serviceRole.orNull)
      .versionLifecycleConfig(versionLifecycleConfig.orNull)
      .build()
}
