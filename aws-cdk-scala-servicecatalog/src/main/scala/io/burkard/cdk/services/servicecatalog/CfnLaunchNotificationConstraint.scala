package io.burkard.cdk.services.servicecatalog

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnLaunchNotificationConstraint {

  def apply(
    internalResourceId: String,
    portfolioId: Option[String] = None,
    description: Option[String] = None,
    notificationArns: Option[List[String]] = None,
    acceptLanguage: Option[String] = None,
    productId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.servicecatalog.CfnLaunchNotificationConstraint =
    software.amazon.awscdk.services.servicecatalog.CfnLaunchNotificationConstraint.Builder
      .create(stackCtx, internalResourceId)
      .portfolioId(portfolioId.orNull)
      .description(description.orNull)
      .notificationArns(notificationArns.map(_.asJava).orNull)
      .acceptLanguage(acceptLanguage.orNull)
      .productId(productId.orNull)
      .build()
}
