package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LogRetentionRetryOptions {

  def apply(
    base: Option[software.amazon.awscdk.Duration] = None,
    maxRetries: Option[Number] = None
  ): software.amazon.awscdk.services.lambda.LogRetentionRetryOptions =
    (new software.amazon.awscdk.services.lambda.LogRetentionRetryOptions.Builder)
      .base(base.orNull)
      .maxRetries(maxRetries.orNull)
      .build()
}
