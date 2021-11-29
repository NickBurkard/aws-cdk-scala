package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LambdaProperty {

  def apply(
    name: Option[String] = None,
    next: Option[String] = None,
    lambdaName: Option[String] = None,
    batchSize: Option[Number] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnPipeline.LambdaProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnPipeline.LambdaProperty.Builder)
      .name(name.orNull)
      .next(next.orNull)
      .lambdaName(lambdaName.orNull)
      .batchSize(batchSize.orNull)
      .build()
}
