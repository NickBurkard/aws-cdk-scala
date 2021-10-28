package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Lambda {

  def apply(
    invocationType: Option[software.amazon.awscdk.services.ses.actions.LambdaInvocationType] = None,
    function: Option[software.amazon.awscdk.services.lambda.IFunction] = None,
    topic: Option[software.amazon.awscdk.services.sns.ITopic] = None
  ): software.amazon.awscdk.services.ses.actions.Lambda =
    software.amazon.awscdk.services.ses.actions.Lambda.Builder
      .create()
      .invocationType(invocationType.orNull)
      .function(function.orNull)
      .topic(topic.orNull)
      .build()
}
