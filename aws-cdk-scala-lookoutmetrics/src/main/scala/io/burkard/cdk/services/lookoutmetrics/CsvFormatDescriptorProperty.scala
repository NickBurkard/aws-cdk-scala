package io.burkard.cdk.services.lookoutmetrics

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CsvFormatDescriptorProperty {

  def apply(
    containsHeader: Option[Boolean] = None,
    headerList: Option[List[String]] = None,
    quoteSymbol: Option[String] = None,
    fileCompression: Option[String] = None,
    charset: Option[String] = None,
    delimiter: Option[String] = None
  ): software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.CsvFormatDescriptorProperty =
    (new software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector.CsvFormatDescriptorProperty.Builder)
      .containsHeader(containsHeader.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .headerList(headerList.map(_.asJava).orNull)
      .quoteSymbol(quoteSymbol.orNull)
      .fileCompression(fileCompression.orNull)
      .charset(charset.orNull)
      .delimiter(delimiter.orNull)
      .build()
}
