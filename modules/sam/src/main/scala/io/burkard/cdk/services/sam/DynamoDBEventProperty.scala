package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DynamoDBEventProperty {

  def apply(
    batchSize: Option[Number] = None,
    stream: Option[String] = None,
    startingPosition: Option[String] = None,
    maximumRetryAttempts: Option[Number] = None,
    maximumRecordAgeInSeconds: Option[Number] = None,
    parallelizationFactor: Option[Number] = None,
    maximumBatchingWindowInSeconds: Option[Number] = None,
    enabled: Option[Boolean] = None,
    destinationConfig: Option[software.amazon.awscdk.services.sam.CfnFunction.DestinationConfigProperty] = None,
    bisectBatchOnFunctionError: Option[Boolean] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.DynamoDBEventProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.DynamoDBEventProperty.Builder)
      .batchSize(batchSize.orNull)
      .stream(stream.orNull)
      .startingPosition(startingPosition.orNull)
      .maximumRetryAttempts(maximumRetryAttempts.orNull)
      .maximumRecordAgeInSeconds(maximumRecordAgeInSeconds.orNull)
      .parallelizationFactor(parallelizationFactor.orNull)
      .maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .destinationConfig(destinationConfig.orNull)
      .bisectBatchOnFunctionError(bisectBatchOnFunctionError.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
