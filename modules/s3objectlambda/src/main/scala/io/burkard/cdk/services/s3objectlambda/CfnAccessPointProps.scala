package io.burkard.cdk.services.s3objectlambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAccessPointProps {

  def apply(
    name: Option[String] = None,
    objectLambdaConfiguration: Option[software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.ObjectLambdaConfigurationProperty] = None
  ): software.amazon.awscdk.services.s3objectlambda.CfnAccessPointProps =
    (new software.amazon.awscdk.services.s3objectlambda.CfnAccessPointProps.Builder)
      .name(name.orNull)
      .objectLambdaConfiguration(objectLambdaConfiguration.orNull)
      .build()
}
