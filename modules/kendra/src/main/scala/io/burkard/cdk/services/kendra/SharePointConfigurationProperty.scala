package io.burkard.cdk.services.kendra

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SharePointConfigurationProperty {

  def apply(
    urls: List[String],
    secretArn: String,
    sharePointVersion: String,
    disableLocalGroups: Option[Boolean] = None,
    exclusionPatterns: Option[List[String]] = None,
    documentTitleFieldName: Option[String] = None,
    fieldMappings: Option[List[_]] = None,
    vpcConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceVpcConfigurationProperty] = None,
    inclusionPatterns: Option[List[String]] = None,
    crawlAttachments: Option[Boolean] = None,
    useChangeLog: Option[Boolean] = None,
    sslCertificateS3Path: Option[software.amazon.awscdk.services.kendra.CfnDataSource.S3PathProperty] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.SharePointConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.SharePointConfigurationProperty.Builder)
      .urls(urls.asJava)
      .secretArn(secretArn)
      .sharePointVersion(sharePointVersion)
      .disableLocalGroups(disableLocalGroups.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .exclusionPatterns(exclusionPatterns.map(_.asJava).orNull)
      .documentTitleFieldName(documentTitleFieldName.orNull)
      .fieldMappings(fieldMappings.map(_.asJava).orNull)
      .vpcConfiguration(vpcConfiguration.orNull)
      .inclusionPatterns(inclusionPatterns.map(_.asJava).orNull)
      .crawlAttachments(crawlAttachments.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .useChangeLog(useChangeLog.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .sslCertificateS3Path(sslCertificateS3Path.orNull)
      .build()
}
