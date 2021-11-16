package io.burkard.cdk.services.servicecatalog

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLaunchNotificationConstraintProps {

  def apply(
    portfolioId: String,
    notificationArns: List[String],
    productId: String,
    description: Option[String] = None,
    acceptLanguage: Option[String] = None
  ): software.amazon.awscdk.services.servicecatalog.CfnLaunchNotificationConstraintProps =
    (new software.amazon.awscdk.services.servicecatalog.CfnLaunchNotificationConstraintProps.Builder)
      .portfolioId(portfolioId)
      .notificationArns(notificationArns.asJava)
      .productId(productId)
      .description(description.orNull)
      .acceptLanguage(acceptLanguage.orNull)
      .build()
}
