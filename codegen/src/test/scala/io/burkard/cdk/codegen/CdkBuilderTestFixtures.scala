package io.burkard.cdk.codegen

import software.amazon.awscdk.Tag
import software.amazon.awscdk.services.cloudwatch.CfnDashboardProps
import software.amazon.awscdk.services.ec2.Connections
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
import software.amazon.awscdk.services.route53.CaaRecord

object CdkBuilderTestFixtures {
  object Valid {
    val contextAndIdServiceName: String = "route53"

    lazy val contextAndIdBuilderClass: Class[CaaRecord.Builder] =
      classOf[CaaRecord.Builder]

    lazy val contextAndIdCdkBuilder: CdkBuilder =
      CdkBuilder(
        serviceName = contextAndIdServiceName,
        instanceCanonicalName = "software.amazon.awscdk.services.route53.CaaRecord",
        instanceSimpleName = "CaaRecord",
        constructorType = CdkBuilder.ConstructorType.CreateContextAndId,
        underlying = contextAndIdBuilderClass
      )

    val createParametersServiceName: String = "core"

    lazy val createParametersBuilderClass: Class[Tag.Builder] =
      classOf[Tag.Builder]

    lazy val createParametersCdkBuilder: CdkBuilder =
      CdkBuilder(
        serviceName = createParametersServiceName,
        instanceCanonicalName = "software.amazon.awscdk.Tag",
        instanceSimpleName = "Tag",
        constructorType = CdkBuilder.ConstructorType.CreateParameters(
          List(
            FieldMethod(
              parameterName = "key",
              methodName = "key",
              typeName = "java.lang.String",
              isOptional = false,
              annotations = Nil
            ),
            FieldMethod(
              parameterName = "value",
              methodName = "value",
              typeName = "java.lang.String",
              isOptional = false,
              annotations = Nil
            )
          )
        ),
        underlying = createParametersBuilderClass
      )

    val createNoParametersServiceName: String = "ec2"

    lazy val createNoParametersBuilderClass: Class[Connections.Builder] =
      classOf[Connections.Builder]

    lazy val createNoParametersCdkBuilder: CdkBuilder =
      CdkBuilder(
        serviceName = createNoParametersServiceName,
        instanceCanonicalName = "software.amazon.awscdk.services.ec2.Connections",
        instanceSimpleName = "Connections",
        constructorType = CdkBuilder.ConstructorType.CreateNoParameters,
        underlying = createNoParametersBuilderClass
      )

    val directConstructorServiceName: String = "cloudwatch"

    lazy val directConstructorBuilderClass: Class[CfnDashboardProps.Builder] =
      classOf[CfnDashboardProps.Builder]

    lazy val directConstructorCdkBuilder: CdkBuilder =
      CdkBuilder(
        serviceName = directConstructorServiceName,
        instanceCanonicalName = "software.amazon.awscdk.services.cloudwatch.CfnDashboardProps",
        instanceSimpleName = "CfnDashboardProps",
        constructorType = CdkBuilder.ConstructorType.DirectConstructorNoParameters,
        underlying = directConstructorBuilderClass
      )

    val requiredFieldsServiceName: String = "kinesisanalytics"

    lazy val requiredFieldsBuilderClass: Class[CfnApplicationV2.Builder] =
      classOf[CfnApplicationV2.Builder]

    val requiredFieldsNames: Set[String] =
      Set("serviceExecutionRole", "runtimeEnvironment")
  }

  object Invalid {
    val invalidServiceName: String = "core"

    val invalidClass: Class[Tag] = classOf[Tag]
  }
}
