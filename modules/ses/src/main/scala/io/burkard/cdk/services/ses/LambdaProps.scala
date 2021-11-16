package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LambdaProps {

  def apply(
    function: software.amazon.awscdk.services.lambda.IFunction,
    invocationType: Option[software.amazon.awscdk.services.ses.actions.LambdaInvocationType] = None,
    topic: Option[software.amazon.awscdk.services.sns.ITopic] = None
  ): software.amazon.awscdk.services.ses.actions.LambdaProps =
    (new software.amazon.awscdk.services.ses.actions.LambdaProps.Builder)
      .function(function)
      .invocationType(invocationType.orNull)
      .topic(topic.orNull)
      .build()
}
