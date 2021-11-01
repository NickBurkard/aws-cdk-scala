package io.burkard.cdk.codegen

import software.amazon.awscdk.services.s3.Bucket
import software.amazon.awscdk.services.lambda.eventsources.AuthenticationMethod

object CdkEnumTestFixtures {
  object Valid {
    val enumServiceName: String = "lambda"

    lazy val enumClass: Class[AuthenticationMethod] = classOf[AuthenticationMethod]

    lazy val enumCdkEnum: CdkEnum =
      CdkEnum(
        serviceName = enumServiceName,
        instanceCanonicalName = "software.amazon.awscdk.services.lambda.eventsources.AuthenticationMethod",
        instanceSimpleName = "AuthenticationMethod",
        valueNames = List(
          "SASL_SCRAM_512_AUTH",
          "SASL_SCRAM_256_AUTH",
          "BASIC_AUTH"
        ),
        underlying = enumClass
      )
  }

  object Invalid {
    val invalidServiceName: String = "s3"

    lazy val invalidClass: Class[Bucket] = classOf[Bucket]
  }
}
