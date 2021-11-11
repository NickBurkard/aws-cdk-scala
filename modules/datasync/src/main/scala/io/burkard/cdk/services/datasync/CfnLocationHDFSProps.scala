package io.burkard.cdk.services.datasync

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLocationHDFSProps {

  def apply(
    authenticationType: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    agentArns: Option[List[String]] = None,
    kmsKeyProviderUri: Option[String] = None,
    blockSize: Option[Number] = None,
    simpleUser: Option[String] = None,
    nameNodes: Option[List[_]] = None,
    qopConfiguration: Option[software.amazon.awscdk.services.datasync.CfnLocationHDFS.QopConfigurationProperty] = None,
    kerberosPrincipal: Option[String] = None,
    kerberosKeytab: Option[String] = None,
    kerberosKrb5Conf: Option[String] = None,
    replicationFactor: Option[Number] = None,
    subdirectory: Option[String] = None
  ): software.amazon.awscdk.services.datasync.CfnLocationHDFSProps =
    (new software.amazon.awscdk.services.datasync.CfnLocationHDFSProps.Builder)
      .authenticationType(authenticationType.orNull)
      .tags(tags.map(_.asJava).orNull)
      .agentArns(agentArns.map(_.asJava).orNull)
      .kmsKeyProviderUri(kmsKeyProviderUri.orNull)
      .blockSize(blockSize.orNull)
      .simpleUser(simpleUser.orNull)
      .nameNodes(nameNodes.map(_.asJava).orNull)
      .qopConfiguration(qopConfiguration.orNull)
      .kerberosPrincipal(kerberosPrincipal.orNull)
      .kerberosKeytab(kerberosKeytab.orNull)
      .kerberosKrb5Conf(kerberosKrb5Conf.orNull)
      .replicationFactor(replicationFactor.orNull)
      .subdirectory(subdirectory.orNull)
      .build()
}
