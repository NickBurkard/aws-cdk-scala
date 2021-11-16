package io.burkard.cdk.services.servicecatalog

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnStackSetConstraintProps {

  def apply(
    portfolioId: String,
    executionRole: String,
    description: String,
    accountList: List[String],
    regionList: List[String],
    productId: String,
    adminRole: String,
    stackInstanceControl: String,
    acceptLanguage: Option[String] = None
  ): software.amazon.awscdk.services.servicecatalog.CfnStackSetConstraintProps =
    (new software.amazon.awscdk.services.servicecatalog.CfnStackSetConstraintProps.Builder)
      .portfolioId(portfolioId)
      .executionRole(executionRole)
      .description(description)
      .accountList(accountList.asJava)
      .regionList(regionList.asJava)
      .productId(productId)
      .adminRole(adminRole)
      .stackInstanceControl(stackInstanceControl)
      .acceptLanguage(acceptLanguage.orNull)
      .build()
}
