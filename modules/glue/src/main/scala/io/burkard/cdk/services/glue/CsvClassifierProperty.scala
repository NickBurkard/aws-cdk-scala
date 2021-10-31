package io.burkard.cdk.services.glue

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CsvClassifierProperty {

  def apply(
    containsHeader: Option[String] = None,
    name: Option[String] = None,
    quoteSymbol: Option[String] = None,
    disableValueTrimming: Option[Boolean] = None,
    header: Option[List[String]] = None,
    allowSingleColumn: Option[Boolean] = None,
    delimiter: Option[String] = None
  ): software.amazon.awscdk.services.glue.CfnClassifier.CsvClassifierProperty =
    (new software.amazon.awscdk.services.glue.CfnClassifier.CsvClassifierProperty.Builder)
      .containsHeader(containsHeader.orNull)
      .name(name.orNull)
      .quoteSymbol(quoteSymbol.orNull)
      .disableValueTrimming(disableValueTrimming.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .header(header.map(_.asJava).orNull)
      .allowSingleColumn(allowSingleColumn.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .delimiter(delimiter.orNull)
      .build()
}
