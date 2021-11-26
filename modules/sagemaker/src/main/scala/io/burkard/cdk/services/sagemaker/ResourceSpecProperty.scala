package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResourceSpecProperty {

  def apply(
    sageMakerImageVersionArn: Option[String] = None,
    instanceType: Option[String] = None,
    sageMakerImageArn: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnDomain.ResourceSpecProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnDomain.ResourceSpecProperty.Builder)
      .sageMakerImageVersionArn(sageMakerImageVersionArn.orNull)
      .instanceType(instanceType.orNull)
      .sageMakerImageArn(sageMakerImageArn.orNull)
      .build()
}
