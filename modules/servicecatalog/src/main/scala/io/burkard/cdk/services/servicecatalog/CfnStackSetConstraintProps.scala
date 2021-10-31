package io.burkard.cdk.services.servicecatalog

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnStackSetConstraintProps {

  def apply(
    portfolioId: Option[String] = None,
    executionRole: Option[String] = None,
    description: Option[String] = None,
    accountList: Option[List[String]] = None,
    regionList: Option[List[String]] = None,
    acceptLanguage: Option[String] = None,
    productId: Option[String] = None,
    adminRole: Option[String] = None,
    stackInstanceControl: Option[String] = None
  ): software.amazon.awscdk.services.servicecatalog.CfnStackSetConstraintProps =
    (new software.amazon.awscdk.services.servicecatalog.CfnStackSetConstraintProps.Builder)
      .portfolioId(portfolioId.orNull)
      .executionRole(executionRole.orNull)
      .description(description.orNull)
      .accountList(accountList.map(_.asJava).orNull)
      .regionList(regionList.map(_.asJava).orNull)
      .acceptLanguage(acceptLanguage.orNull)
      .productId(productId.orNull)
      .adminRole(adminRole.orNull)
      .stackInstanceControl(stackInstanceControl.orNull)
      .build()
}
