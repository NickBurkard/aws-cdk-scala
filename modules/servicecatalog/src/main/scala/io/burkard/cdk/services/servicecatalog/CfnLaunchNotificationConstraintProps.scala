package io.burkard.cdk.services.servicecatalog

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnLaunchNotificationConstraintProps {

  def apply(
    portfolioId: Option[String] = None,
    description: Option[String] = None,
    notificationArns: Option[List[String]] = None,
    acceptLanguage: Option[String] = None,
    productId: Option[String] = None
  ): software.amazon.awscdk.services.servicecatalog.CfnLaunchNotificationConstraintProps =
    (new software.amazon.awscdk.services.servicecatalog.CfnLaunchNotificationConstraintProps.Builder)
      .portfolioId(portfolioId.orNull)
      .description(description.orNull)
      .notificationArns(notificationArns.map(_.asJava).orNull)
      .acceptLanguage(acceptLanguage.orNull)
      .productId(productId.orNull)
      .build()
}
