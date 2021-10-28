package io.burkard.cdk.services.appflow

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SalesforceDestinationPropertiesProperty {

  def apply(
    writeOperationType: Option[String] = None,
    idFieldNames: Option[List[String]] = None,
    `object`: Option[String] = None,
    errorHandlingConfig: Option[software.amazon.awscdk.services.appflow.CfnFlow.ErrorHandlingConfigProperty] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.SalesforceDestinationPropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.SalesforceDestinationPropertiesProperty.Builder)
      .writeOperationType(writeOperationType.orNull)
      .idFieldNames(idFieldNames.map(_.asJava).orNull)
      .`object`(`object`.orNull)
      .errorHandlingConfig(errorHandlingConfig.orNull)
      .build()
}
