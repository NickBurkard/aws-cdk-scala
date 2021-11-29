package io.burkard.cdk.services.s3objectlambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAccessPoint {

  def apply(
    internalResourceId: String,
    objectLambdaConfiguration: software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.ObjectLambdaConfigurationProperty,
    name: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint =
    software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.Builder
      .create(stackCtx, internalResourceId)
      .objectLambdaConfiguration(objectLambdaConfiguration)
      .name(name.orNull)
      .build()
}
