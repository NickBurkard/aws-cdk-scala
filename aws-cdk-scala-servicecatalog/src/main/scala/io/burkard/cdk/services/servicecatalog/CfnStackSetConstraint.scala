package io.burkard.cdk.services.servicecatalog

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnStackSetConstraint {

  def apply(
    internalResourceId: String,
    portfolioId: Option[String] = None,
    executionRole: Option[String] = None,
    description: Option[String] = None,
    accountList: Option[List[String]] = None,
    regionList: Option[List[String]] = None,
    acceptLanguage: Option[String] = None,
    productId: Option[String] = None,
    adminRole: Option[String] = None,
    stackInstanceControl: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.servicecatalog.CfnStackSetConstraint =
    software.amazon.awscdk.services.servicecatalog.CfnStackSetConstraint.Builder
      .create(stackCtx, internalResourceId)
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
