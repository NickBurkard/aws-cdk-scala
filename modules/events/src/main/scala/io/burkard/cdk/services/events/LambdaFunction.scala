package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LambdaFunction {

  def apply(
    handler: software.amazon.awscdk.services.lambda.IFunction,
    maxEventAge: Option[software.amazon.awscdk.Duration] = None,
    event: Option[software.amazon.awscdk.services.events.RuleTargetInput] = None,
    deadLetterQueue: Option[software.amazon.awscdk.services.sqs.IQueue] = None,
    retryAttempts: Option[Number] = None
  ): software.amazon.awscdk.services.events.targets.LambdaFunction =
    software.amazon.awscdk.services.events.targets.LambdaFunction.Builder
      .create(handler)
      .maxEventAge(maxEventAge.orNull)
      .event(event.orNull)
      .deadLetterQueue(deadLetterQueue.orNull)
      .retryAttempts(retryAttempts.orNull)
      .build()
}
