package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ActionProperty {

  def apply(
    s3Action: Option[software.amazon.awscdk.services.ses.CfnReceiptRule.S3ActionProperty] = None,
    snsAction: Option[software.amazon.awscdk.services.ses.CfnReceiptRule.SNSActionProperty] = None,
    addHeaderAction: Option[software.amazon.awscdk.services.ses.CfnReceiptRule.AddHeaderActionProperty] = None,
    lambdaAction: Option[software.amazon.awscdk.services.ses.CfnReceiptRule.LambdaActionProperty] = None,
    workmailAction: Option[software.amazon.awscdk.services.ses.CfnReceiptRule.WorkmailActionProperty] = None,
    bounceAction: Option[software.amazon.awscdk.services.ses.CfnReceiptRule.BounceActionProperty] = None,
    stopAction: Option[software.amazon.awscdk.services.ses.CfnReceiptRule.StopActionProperty] = None
  ): software.amazon.awscdk.services.ses.CfnReceiptRule.ActionProperty =
    (new software.amazon.awscdk.services.ses.CfnReceiptRule.ActionProperty.Builder)
      .s3Action(s3Action.orNull)
      .snsAction(snsAction.orNull)
      .addHeaderAction(addHeaderAction.orNull)
      .lambdaAction(lambdaAction.orNull)
      .workmailAction(workmailAction.orNull)
      .bounceAction(bounceAction.orNull)
      .stopAction(stopAction.orNull)
      .build()
}
