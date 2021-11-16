package io.burkard.cdk.services.appflow

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ZendeskDestinationPropertiesProperty {

  def apply(
    `object`: String,
    writeOperationType: Option[String] = None,
    idFieldNames: Option[List[String]] = None,
    errorHandlingConfig: Option[software.amazon.awscdk.services.appflow.CfnFlow.ErrorHandlingConfigProperty] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.ZendeskDestinationPropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.ZendeskDestinationPropertiesProperty.Builder)
      .`object`(`object`)
      .writeOperationType(writeOperationType.orNull)
      .idFieldNames(idFieldNames.map(_.asJava).orNull)
      .errorHandlingConfig(errorHandlingConfig.orNull)
      .build()
}
