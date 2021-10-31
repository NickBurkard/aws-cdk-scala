package io.burkard.cdk.services.iotanalytics

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SchemaDefinitionProperty {

  def apply(
    columns: Option[List[_]] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnDatastore.SchemaDefinitionProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDatastore.SchemaDefinitionProperty.Builder)
      .columns(columns.map(_.asJava).orNull)
      .build()
}
