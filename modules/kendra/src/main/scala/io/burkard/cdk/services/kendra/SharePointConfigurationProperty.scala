package io.burkard.cdk.services.kendra

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SharePointConfigurationProperty {

  def apply(
    disableLocalGroups: Option[Boolean] = None,
    exclusionPatterns: Option[List[String]] = None,
    documentTitleFieldName: Option[String] = None,
    fieldMappings: Option[List[_]] = None,
    urls: Option[List[String]] = None,
    vpcConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceVpcConfigurationProperty] = None,
    inclusionPatterns: Option[List[String]] = None,
    crawlAttachments: Option[Boolean] = None,
    useChangeLog: Option[Boolean] = None,
    secretArn: Option[String] = None,
    sharePointVersion: Option[String] = None,
    sslCertificateS3Path: Option[software.amazon.awscdk.services.kendra.CfnDataSource.S3PathProperty] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.SharePointConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.SharePointConfigurationProperty.Builder)
      .disableLocalGroups(disableLocalGroups.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .exclusionPatterns(exclusionPatterns.map(_.asJava).orNull)
      .documentTitleFieldName(documentTitleFieldName.orNull)
      .fieldMappings(fieldMappings.map(_.asJava).orNull)
      .urls(urls.map(_.asJava).orNull)
      .vpcConfiguration(vpcConfiguration.orNull)
      .inclusionPatterns(inclusionPatterns.map(_.asJava).orNull)
      .crawlAttachments(crawlAttachments.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .useChangeLog(useChangeLog.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .secretArn(secretArn.orNull)
      .sharePointVersion(sharePointVersion.orNull)
      .sslCertificateS3Path(sslCertificateS3Path.orNull)
      .build()
}
