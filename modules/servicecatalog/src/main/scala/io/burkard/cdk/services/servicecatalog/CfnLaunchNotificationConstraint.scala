package io.burkard.cdk.services.servicecatalog

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLaunchNotificationConstraint {

  def apply(
    internalResourceId: String,
    portfolioId: String,
    notificationArns: List[String],
    productId: String,
    description: Option[String] = None,
    acceptLanguage: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.servicecatalog.CfnLaunchNotificationConstraint =
    software.amazon.awscdk.services.servicecatalog.CfnLaunchNotificationConstraint.Builder
      .create(stackCtx, internalResourceId)
      .portfolioId(portfolioId)
      .notificationArns(notificationArns.asJava)
      .productId(productId)
      .description(description.orNull)
      .acceptLanguage(acceptLanguage.orNull)
      .build()
}
