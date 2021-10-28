package io.burkard.cdk.services.glue

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
