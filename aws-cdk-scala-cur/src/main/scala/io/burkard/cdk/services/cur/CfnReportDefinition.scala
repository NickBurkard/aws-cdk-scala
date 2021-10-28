package io.burkard.cdk.services.cur

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnReportDefinition {

  def apply(
    internalResourceId: String,
    s3Bucket: Option[String] = None,
    additionalSchemaElements: Option[List[String]] = None,
    reportName: Option[String] = None,
    s3Prefix: Option[String] = None,
    s3Region: Option[String] = None,
    refreshClosedReports: Option[Boolean] = None,
    format: Option[String] = None,
    reportVersioning: Option[String] = None,
    compression: Option[String] = None,
    billingViewArn: Option[String] = None,
    additionalArtifacts: Option[List[String]] = None,
    timeUnit: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cur.CfnReportDefinition =
    software.amazon.awscdk.services.cur.CfnReportDefinition.Builder
      .create(stackCtx, internalResourceId)
      .s3Bucket(s3Bucket.orNull)
      .additionalSchemaElements(additionalSchemaElements.map(_.asJava).orNull)
      .reportName(reportName.orNull)
      .s3Prefix(s3Prefix.orNull)
      .s3Region(s3Region.orNull)
      .refreshClosedReports(refreshClosedReports.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .format(format.orNull)
      .reportVersioning(reportVersioning.orNull)
      .compression(compression.orNull)
      .billingViewArn(billingViewArn.orNull)
      .additionalArtifacts(additionalArtifacts.map(_.asJava).orNull)
      .timeUnit(timeUnit.orNull)
      .build()
}
