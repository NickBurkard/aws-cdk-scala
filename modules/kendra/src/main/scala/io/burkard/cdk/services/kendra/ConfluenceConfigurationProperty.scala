package io.burkard.cdk.services.kendra

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ConfluenceConfigurationProperty {

  def apply(
    exclusionPatterns: Option[List[String]] = None,
    attachmentConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceAttachmentConfigurationProperty] = None,
    serverUrl: Option[String] = None,
    vpcConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceVpcConfigurationProperty] = None,
    inclusionPatterns: Option[List[String]] = None,
    version: Option[String] = None,
    pageConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.ConfluencePageConfigurationProperty] = None,
    blogConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceBlogConfigurationProperty] = None,
    spaceConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceSpaceConfigurationProperty] = None,
    secretArn: Option[String] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceConfigurationProperty.Builder)
      .exclusionPatterns(exclusionPatterns.map(_.asJava).orNull)
      .attachmentConfiguration(attachmentConfiguration.orNull)
      .serverUrl(serverUrl.orNull)
      .vpcConfiguration(vpcConfiguration.orNull)
      .inclusionPatterns(inclusionPatterns.map(_.asJava).orNull)
      .version(version.orNull)
      .pageConfiguration(pageConfiguration.orNull)
      .blogConfiguration(blogConfiguration.orNull)
      .spaceConfiguration(spaceConfiguration.orNull)
      .secretArn(secretArn.orNull)
      .build()
}
