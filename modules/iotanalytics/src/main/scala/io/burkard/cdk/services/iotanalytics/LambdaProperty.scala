package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LambdaProperty {

  def apply(
    name: String,
    lambdaName: String,
    batchSize: Number,
    next: Option[String] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnPipeline.LambdaProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnPipeline.LambdaProperty.Builder)
      .name(name)
      .lambdaName(lambdaName)
      .batchSize(batchSize)
      .next(next.orNull)
      .build()
}
