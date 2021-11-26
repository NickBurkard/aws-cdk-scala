package io.burkard.cdk.services.s3objectlambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAccessPointProps {

  def apply(
    objectLambdaConfiguration: software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.ObjectLambdaConfigurationProperty,
    name: Option[String] = None
  ): software.amazon.awscdk.services.s3objectlambda.CfnAccessPointProps =
    (new software.amazon.awscdk.services.s3objectlambda.CfnAccessPointProps.Builder)
      .objectLambdaConfiguration(objectLambdaConfiguration)
      .name(name.orNull)
      .build()
}
