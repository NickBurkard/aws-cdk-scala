package io.burkard.cdk.services.s3objectlambda

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnAccessPoint {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    objectLambdaConfiguration: Option[software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.ObjectLambdaConfigurationProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint =
    software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .objectLambdaConfiguration(objectLambdaConfiguration.orNull)
      .build()
}
