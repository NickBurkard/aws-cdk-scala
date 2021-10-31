package io.burkard.cdk.services.elasticbeanstalk

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApplicationVersionProps {

  def apply(
    description: Option[String] = None,
    applicationName: Option[String] = None,
    sourceBundle: Option[software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion.SourceBundleProperty] = None
  ): software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersionProps =
    (new software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersionProps.Builder)
      .description(description.orNull)
      .applicationName(applicationName.orNull)
      .sourceBundle(sourceBundle.orNull)
      .build()
}
