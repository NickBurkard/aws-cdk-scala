package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ReceiptRuleActionConfig {

  def apply(
    s3Action: Option[software.amazon.awscdk.services.ses.S3ActionConfig] = None,
    snsAction: Option[software.amazon.awscdk.services.ses.SNSActionConfig] = None,
    addHeaderAction: Option[software.amazon.awscdk.services.ses.AddHeaderActionConfig] = None,
    lambdaAction: Option[software.amazon.awscdk.services.ses.LambdaActionConfig] = None,
    workmailAction: Option[software.amazon.awscdk.services.ses.WorkmailActionConfig] = None,
    bounceAction: Option[software.amazon.awscdk.services.ses.BounceActionConfig] = None,
    stopAction: Option[software.amazon.awscdk.services.ses.StopActionConfig] = None
  ): software.amazon.awscdk.services.ses.ReceiptRuleActionConfig =
    (new software.amazon.awscdk.services.ses.ReceiptRuleActionConfig.Builder)
      .s3Action(s3Action.orNull)
      .snsAction(snsAction.orNull)
      .addHeaderAction(addHeaderAction.orNull)
      .lambdaAction(lambdaAction.orNull)
      .workmailAction(workmailAction.orNull)
      .bounceAction(bounceAction.orNull)
      .stopAction(stopAction.orNull)
      .build()
}
