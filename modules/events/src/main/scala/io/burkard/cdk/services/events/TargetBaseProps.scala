package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TargetBaseProps {

  def apply(
    maxEventAge: Option[software.amazon.awscdk.Duration] = None,
    deadLetterQueue: Option[software.amazon.awscdk.services.sqs.IQueue] = None,
    retryAttempts: Option[Number] = None
  ): software.amazon.awscdk.services.events.targets.TargetBaseProps =
    (new software.amazon.awscdk.services.events.targets.TargetBaseProps.Builder)
      .maxEventAge(maxEventAge.orNull)
      .deadLetterQueue(deadLetterQueue.orNull)
      .retryAttempts(retryAttempts.orNull)
      .build()
}
