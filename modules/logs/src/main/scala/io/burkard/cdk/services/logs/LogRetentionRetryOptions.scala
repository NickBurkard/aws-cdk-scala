package io.burkard.cdk.services.logs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LogRetentionRetryOptions {

  def apply(
    base: Option[software.amazon.awscdk.Duration] = None,
    maxRetries: Option[Number] = None
  ): software.amazon.awscdk.services.logs.LogRetentionRetryOptions =
    (new software.amazon.awscdk.services.logs.LogRetentionRetryOptions.Builder)
      .base(base.orNull)
      .maxRetries(maxRetries.orNull)
      .build()
}
