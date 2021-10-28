package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CodePipeline {

  def apply(
    pipeline: software.amazon.awscdk.services.codepipeline.IPipeline,
    maxEventAge: Option[software.amazon.awscdk.Duration] = None,
    eventRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    deadLetterQueue: Option[software.amazon.awscdk.services.sqs.IQueue] = None,
    retryAttempts: Option[Number] = None
  ): software.amazon.awscdk.services.events.targets.CodePipeline =
    software.amazon.awscdk.services.events.targets.CodePipeline.Builder
      .create(pipeline)
      .maxEventAge(maxEventAge.orNull)
      .eventRole(eventRole.orNull)
      .deadLetterQueue(deadLetterQueue.orNull)
      .retryAttempts(retryAttempts.orNull)
      .build()
}
