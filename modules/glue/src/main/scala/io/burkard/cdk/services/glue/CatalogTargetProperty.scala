package io.burkard.cdk.services.glue

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CatalogTargetProperty {

  def apply(
    databaseName: Option[String] = None,
    tables: Option[List[String]] = None
  ): software.amazon.awscdk.services.glue.CfnCrawler.CatalogTargetProperty =
    (new software.amazon.awscdk.services.glue.CfnCrawler.CatalogTargetProperty.Builder)
      .databaseName(databaseName.orNull)
      .tables(tables.map(_.asJava).orNull)
      .build()
}
